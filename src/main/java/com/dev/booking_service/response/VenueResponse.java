package com.dev.booking_service.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VenueResponse {

    private Long id;
    private String name;
    private Long totalCapacity;
    private String address;
}
