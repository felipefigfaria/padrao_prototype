package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Cliente cliente = new Cliente(321, "Cliente Original", new Endereco("Rua Bougainville", 92), "Paraíba do Sul");

        Cliente clienteClone = cliente.clone();
        clienteClone.setIdCliente(654);
        clienteClone.setNome("Cliente Clonado");
        clienteClone.getEndereco().setNumero(29);

        assertEquals("Cliente{idCliente=321, nome='Cliente Original', endereco=Endereco{logradouro='Rua Bougainville', numero=92}, localNascimento='Paraíba do Sul'}", cliente.toString());
        assertEquals("Cliente{idCliente=654, nome='Cliente Clonado', endereco=Endereco{logradouro='Rua Bougainville', numero=29}, localNascimento='Paraíba do Sul'}", clienteClone.toString());
    }
}