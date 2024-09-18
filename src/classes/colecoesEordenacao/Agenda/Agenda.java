package classes.colecoesEordenacao.Agenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    // Método para adicionar contato na agenda

    public void adicionaContato(Contato contato) {
        this.contatos.add(contato);
    }

    // Métodos da agenda de ordenação usando comparable e comparator

    // Ordenar e exibir por nome
    public List<Contato> ordenarPorNome() {
        List<Contato> contatosOrdenadosPorNome = new ArrayList<>(contatos);
        sort(contatosOrdenadosPorNome);
        return contatosOrdenadosPorNome;
    }

    public void exibirContatosPorNome() {
        List<Contato> contatosOrdenados = ordenarPorNome();
        for (Contato contatosOrdenado : contatosOrdenados) {
            System.out.println(contatosOrdenado);
        }
    }
    // Ordenar e exibir por idade
    public List<Contato> ordenarPorIdade() {
        List<Contato> contatosOrdenadosPorIdade = new ArrayList<>(contatos);
        contatosOrdenadosPorIdade.sort(new ContatoPorIdadeComparator());
        return contatosOrdenadosPorIdade;
    }

    public void exibirContatosPorIdade() {
        List<Contato> contatosOrdenados = ordenarPorIdade();
        for (Contato contatosOrdenado : contatosOrdenados) {
            System.out.println(contatosOrdenado);
        }
    }

}
