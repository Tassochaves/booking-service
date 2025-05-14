package com.dev.booking_service.service;

import org.springframework.stereotype.Service;

import com.dev.booking_service.request.BookingRequest;
import com.dev.booking_service.response.BookingResponse;

@Service
public class BookingService {

    public BookingResponse createBooking(final BookingRequest request) {
        // - verificar se o usuário existe
        // - verificar se há estoque suficiente
        // - obter informações do evento para também obter informações do local
        // - criar reserva
        // - enviar reserva para o Serviço de Pedidos em um Tópico do Kafka
        throw new UnsupportedOperationException("Unimplemented method 'createBooking'");
    }

}
