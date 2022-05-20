
package com.example.portfolio.controller;

import com.example.portfolio.model.User;
import com.example.portfolio.model.dto.UserDto;
import com.example.portfolio.service.interfaces.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
    @Autowired
    private IAuthService authServ;
    
    //AuthController recibe un UserDto
    @PostMapping ("/login")
    public boolean login(@RequestBody UserDto userDto){
    
        return authServ.isUserEnabled(userDto);
    
    }
    
    //Metodo para registrar usuarios. No funcionará desde el Frontend(Angular).
    @PostMapping ("/register")
    public void register(@RequestBody User user) throws Exception{
        
        authServ.crearUsuario(user);
        
    
    }
}
