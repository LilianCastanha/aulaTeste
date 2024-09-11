package br.com.aulateste.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculoService {

    public static List<String> contarRepetidos(List<Float> numeros) {
        List<String> repetidos = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            Float numero = numeros.get(i);
            if (numero % 2 == 0) {
                repetidos.add(String.valueOf(numero));
            }
        }
        return repetidos;
    }

    public int Listasoma(List<Integer> lista) {
        int soma = 0;
        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }
        return soma;
    }

    public int buscarMaiorNumero(List<Integer> lista) {
        int maiorNumero = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maiorNumero) {
                maiorNumero = lista.get(i);
            }
        }
        return maiorNumero;
    }

    public int buscarMenorNumero(List<Integer> lista) {
        int menorNumero = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) < 0) {
                menorNumero = lista.get(i);
            }
        }
        return menorNumero;
    }

    public int ListMedia(List<Integer> lista) {
        int media = 0;
        for (int i = 0; i < lista.size(); i++) {
            media += lista.get(i);
        }
        return media / lista.size();
    }
}






