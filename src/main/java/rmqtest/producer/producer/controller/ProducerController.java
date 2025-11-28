package rmqtest.producer.producer.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rmqtest.producer.producer.dto.PedidoDTO;

@RestController
@RequestMapping("/orders")
public class ProducerController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private long contadorId = 1L;

    @PostMapping
    public ResponseEntity<PedidoDTO> createOrder(@RequestBody PedidoDTO pedido) {
        pedido.setId(contadorId++);

        rabbitTemplate.convertAndSend("ecommercermq", "ordersCarlosParllon", pedido);

        return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
    }
}