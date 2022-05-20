
package com.example.portfolio.service.interfaces;

import com.example.portfolio.model.User;
import com.example.portfolio.model.dto.UserDto;


public interface IAuthService {
 
    public boolean isUserEnabled(UserDto userDto) ;
    public void crearUsuario(User user) throws Exception;
     
}
