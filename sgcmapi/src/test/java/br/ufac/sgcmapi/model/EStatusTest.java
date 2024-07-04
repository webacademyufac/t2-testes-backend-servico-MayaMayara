package br.ufac.sgcmapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EStatusTest {

    @Test
    public void testProximo() {
        EStatus cancelado = EStatus.CANCELADO;
        EStatus agendado = EStatus.AGENDADO;
        EStatus comfirmado =EStatus.CONFIRMADO;
        EStatus cehgada = EStatus.CHEGADA;
        EStatus atendimento = EStatus.ATENDIMENTO;
        EStatus encerrado = EStatus.ENCERRADO;
        
        assertEquals(cancelado, cancelado.proximo());
        assertEquals(comfirmado, agendado.proximo());
        assertEquals(cehgada, comfirmado.proximo());
        assertEquals(atendimento, cehgada.proximo());
        assertEquals(encerrado, atendimento.proximo());

    }
}
