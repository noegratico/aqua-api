package com.auqaapi.aquaapi.Model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class AquaUserResponse {
    private List<AquaUser> aquaUserList;
}
