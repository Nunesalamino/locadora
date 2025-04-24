package vo;

import javax.xml.crypto.Data;

public class Aluguel {
    private Cliente cliente;
    private Jogo jogo;
    private Data dataAluguel;
    private Data dataDevolucao;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Data getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Data dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}


