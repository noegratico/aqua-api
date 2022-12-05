package com.auqaapi.aquaapi.Controller;

import com.auqaapi.aquaapi.Model.AquaMessageResponse;
import com.auqaapi.aquaapi.Model.AquaUser;
import com.auqaapi.aquaapi.Service.AquaUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aqua")
@RequiredArgsConstructor
public class AquaUserController {

    private final AquaUserService service;


    @PostMapping("/login")
    public AquaMessageResponse logIn(@RequestBody AquaUser aquaUser){
     return service.logIn(aquaUser);
    }

}
