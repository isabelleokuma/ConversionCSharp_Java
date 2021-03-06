package Program;

public class List {
    private int CAPACIDADE = 10;
    private String[] dados = new String[CAPACIDADE];
    int quantidade = 0;

    public int Tamanho() {
        return quantidade;
    }

    public void InsereNaPosicao(int p_posicao, String p_valor) throws Exception  {
        if(Tamanho() == CAPACIDADE) {
            throw new Exception("A lista está cheia!!\n\n");
        }
        else if(p_posicao > Tamanho()) {
            throw new Exception("Não é possível inserir nessa posição");
        }
        else{
            quantidade++;
            for (int i = Tamanho() - 1; i > p_posicao; i--){
                dados[i] = dados[i-1];
            }
            dados[p_posicao] = p_valor;
        }
    }

    public String RemoveDaPosicao(int posicao) throws Exception
    {
        if (Tamanho() == 0)
            throw new Exception("A lista está vazia!!!");
        else if (posicao > Tamanho() - 1)
            throw new Exception("Posição inválida!!!");
        else
        {
            String aux = dados[posicao];
            for (int i = posicao; i < Tamanho() - 1; i++)
            {
                dados[i] = dados[i + 1];
            }
            quantidade--;
            dados[quantidade] = null;
            return aux;
        }
    }

    public void InsereNoInicio(String p_valor) throws Exception
    {
        InsereNaPosicao(0, p_valor);
    }

    public void InsereNoFim(String p_valor) throws Exception
    {
        InsereNaPosicao(Tamanho(), p_valor);
    }

    public void ImprimeLista()
    {
        System.out.println("\n\nImpressão dos dados da lista:\n");
        for (int i = 0; i < Tamanho(); i++)
        {
            System.out.println(dados[i]);
        }
    }
}
