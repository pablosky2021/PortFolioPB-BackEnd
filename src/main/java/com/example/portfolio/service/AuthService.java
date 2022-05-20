
package com.example.portfolio.service;

import com.example.portfolio.service.interfaces.IAuthService;
import com.example.portfolio.model.User;
import com.example.portfolio.model.dto.UserDto;
import com.example.portfolio.repository.AuthRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthService{

    @Autowired
    public AuthRepository authRepo;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    
    @Override
    public boolean isUserEnabled(UserDto userDto) {
            
        boolean isUserEnabled = false;
        
        List<User> users = authRepo.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if (!users.isEmpty()){
            User user = users.get(0);
            if (passwordEncoder.matches(userDto.getPassword(),user.getPassword())){
                isUserEnabled = true;
            }
        }
        return isUserEnabled;
    }

    @Override
    public void crearUsuario(User user) throws Exception {
        List<User> users = authRepo.findByEmailAndIsEnabledTrue(user.getEmail());
        if (!users.isEmpty()){
            
            
            throw new Exception("El email ingresado ya se encuentra registrado.");
          
        
        }else{
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setIsEnabled(true);    
        authRepo.save(user);
        }
    }
    
}
