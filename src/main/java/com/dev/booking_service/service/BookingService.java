package com.dev.booking_service.service;

import org.springframework.stereotype.Service;

import com.dev.booking_service.client.InventoryServiceClient;
import com.dev.booking_service.entity.Customer;
import com.dev.booking_service.repository.CustomerRepository;
import com.dev.booking_service.request.BookingRequest;
import com.dev.booking_service.response.BookingResponse;
import com.dev.booking_service.response.InventoryResponse;

@Service
public class BookingService {

    private final CustomerRepository customerRepository;
    private final InventoryServiceClient inventoryServiceClient;

    public BookingService(
            final CustomerRepository customerRepository,
            final InventoryServiceClient inventoryServiceClient) {
        this.customerRepository = customerRepository;
        this.inventoryServiceClient = inventoryServiceClient;
    }

    public BookingResponse createBooking(final BookingRequest request) {
        // - verificar se o usuário existe
        final Customer customer = customerRepository.findById(request.getUserId()).orElse(null);
        if (customer == null) {
            throw new RuntimeException("User not found");
        }

        // - verificar se há estoque suficiente
        final InventoryResponse inventoryResponse = inventoryServiceClient.getInventory(request.getEventId());
        System.out.println("Inventory service response: " + inventoryResponse);
        // - obter informações do evento para também obter informações do local
        // - criar reserva
        // - enviar reserva para o Serviço de Pedidos em um Tópico do Kafka

        return BookingResponse.builder().build();
    }

}
