package com.auqaapi.aquaapi.Service;

import com.auqaapi.aquaapi.Model.AquaMessageResponse;
import com.auqaapi.aquaapi.Model.AquaUser;
import com.auqaapi.aquaapi.Model.AquaUserResponse;
import com.auqaapi.aquaapi.Repository.AquaUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AquaUserService {

    private final AquaUserRepository aquaUserRepository;

    public AquaMessageResponse logIn(AquaUser aquaUser) {

        return aquaUserRepository.findByUsername(aquaUser.getUsername())
                .filter(user -> user.getPassword().equals(aquaUser.getPassword()))
                .map(user -> AquaMessageResponse.builder().message("Success").build())
                .orElseThrow(() -> new RuntimeException("Failed"));


    }
}
