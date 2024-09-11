package br.com.aulateste;

import br.com.aulateste.service.CalculoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculoServiceTest {

    @Autowired
    private CalculoService calculoService;

    @Test
    @DisplayName("Funcao Listar soma")
    public void funcaoListaSoma() {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        assertEquals(10, calculoService.Listasoma(listaNumeros));
        Assertions.assertNotEquals(12.5, calculoService.Listasoma(listaNumeros));
    }

    @Test
    @DisplayName("Funcao Listar Media")
    public void funcaoListaMedia() {
        List<Integer> listaMedia = new ArrayList<>();
        listaMedia.add(1);
        listaMedia.add(2);
        listaMedia.add(3);
        listaMedia.add(4);
        assertEquals(2.5, calculoService.ListMedia(listaMedia));
        Assertions.assertNotEquals(12.5, calculoService.ListMedia(listaMedia));
    }

    @Test
    @DisplayName("Funcao Listar Maior Numero")
    public void funcaoBuscarMaiorNumero() {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        assertEquals(4, calculoService.buscarMaiorNumero(listaNumeros));
        Assertions.assertNotEquals(12, calculoService.buscarMaiorNumero(listaNumeros));

    }

    @Test
    @DisplayName("Funcao Listar Menor Numero")
    public void funcaoBuscarMenorNumero() {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        assertEquals(1, calculoService.buscarMenorNumero(listaNumeros));
        Assertions.assertNotEquals(4, calculoService.buscarMenorNumero(listaNumeros));
    }

    @Test
    @DisplayName("Funcao contar numeros repetidos")
    public void funcaoContarNumerosRepetidos() {
        {
            List<Float> numeros = Arrays.asList(1.0f, 2.0f, 3.0f, 2.0f, 4.0f, 1.0f, 5.0f);
            List<String> numerosEsperados = Arrays.asList("1.0 aparece 2 vezes", "2.0 aparece 2 vezes","3.0 aparece 2 vezes");
            List<String> resultado = CalculoService.contarRepetidos(numeros);
            assertEquals(numerosEsperados, resultado);
        }

    }
}



