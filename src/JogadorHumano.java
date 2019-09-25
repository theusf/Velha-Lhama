import java.io.*;

class JogadorHumano
{
    private Marca          marca = null;
    private Tabuleiro      tabDoJogo;
    private BufferedReader entrada = new BufferedReader
                                    (new InputStreamReader
                                    (System.in));

    public JogadorHumano (Tabuleiro tab) throws Exception
    {

		if ( tab != null )
		{
		this.tabDoJogo = tab;

		String r = "";
		boolean foi = false;
		do
		{
		System.out.println ("ESCOLHA A SUA MARCA (X ou O) ");
		r = entrada.readLine().toUpperCase();
			if ( (r.contains("X")) )
			{
				this.marca = new Marca('X');
				foi = true;
			}
			if ( (r.contains("O")) )
			{
				this.marca = new Marca('O');
				foi = true;
			}

		} while (foi != true );

			}
			else
				throw new Exception ("Tabuleiro não pode ser nulo");



        // inicia tabDoJogo com tab e pergunta ao jogador qual marca (X ou O) deseja usar,
        // iniciando marca; lanca excecao caso o tab seja nulo
    }

    public JogadorHumano (Tabuleiro tab, Marca mrc) throws Exception
    {
        if ( ( tab != null ) || ( mrc != null ) )
			{
			this.tabDoJogo = tab;
			this.marca = mrc;
			}
		else
			throw new Exception ("Tabuleiro ou Marca não pode ser nulo");

        // inicia tabDoJogo com tab e marca com mrc; lanca excecao caso tab ou mrc sejam nulos
    }

    public Marca getMarca ()
    {
        Marca ret = this.marca;
        return ret;

        // retorna a marca do jogador
    }

    public void facaSuaJogada ()
    {

        boolean foi = false;

        do
       {
        System.out.println ("Faça sua jogada");
        System.out.println ("Linha: ?");
        try {
		String linha = entrada.readLine();

        System.out.println ("Coluna: ?");
		String coluna = entrada.readLine();

		int lin = Integer.parseInt(linha);
		int col = Integer.parseInt(coluna);

        	if ( ( lin > 0 && lin < 4 ) &&  ( col > 0 && col < 4 ) )
        		if ( !(this.tabDoJogo.haMarcaNaPosicao(lin,col)) )
				{
					this.tabDoJogo.setMarcaNaPosicao(this.marca,lin,col);
					foi = true;
				}

		} catch (Exception erro) {}
		}	while (foi != true);

        // pergunta, quantas vezes forem necessarias, onde o jogador quer jogar
        // (ate que o mesmo indique uma jogada valida), que sera a jogada do jogador
    }

    public void vcGanhou ()
    {

        System.out.println ("Você ganhou!");

    }

    public void vcPerdeu ()
    {
         System.out.println ("Você perdeu!");
    }

    public void deuVelha ()
    {
         System.out.println ("Não deu pra nínguem meu chapa");
    }

    public boolean querMaisUmaPartida ()
    {
		String r = "";
        do
        {
        System.out.println("Quer jogar mais uminha rs? Responda com S ou N");
		try { r = entrada.readLine(); } catch (Exception erro) {}
			if ( !(r.contains("S") || r.contains("N") ) )
			System.out.println("Digite uma resposta correta");

		} while ( !(r.contains("S") || r.contains("N") ) );


		System.out.println("Chegou no return");
		if ( r.contains("S") )
			return true;

		System.out.println("Chegou no return2");
		return false;


        // pergunta, quantas vezes forem necessarias, se o jogador deseja jogar
        // mais uma partida (ate que o mesmo forneca uma resposta valida), retornando
        // true caso seja seu desejo jogar mais uma partida, ou false, caso contrario

    }
    public String toString ()
    {
        return "Jogador Humano";
    }

    public boolean equals (Object obj)
    {
         boolean ret = false;

				        if (this==obj) // vendo se this e obj representam a mesma intancia
						ret = true;

						if (obj==null) // tenho certeza de que this!=null
						ret = false;

						      //if (this.getClass()==obj.getClass())
						        if (!(obj instanceof JogadorHumano))
						            ret = false;


						JogadorHumano jog = (JogadorHumano)obj; // convencendo Java de que obj é um Deposito e dando a ele um nome de Deposito (que é dep)



								if ( this.marca == jog.marca )
								ret = true;

								if ( this.tabDoJogo == jog.tabDoJogo )
								ret = true;



				        // verifica se this é igual a obj, retornando true em caso afirmativo,
				        // ou false em caso negativo
		return ret;
    }

    public int hashCode ()
    {
        int ret = 666;



			ret = ret * 7 + new Integer ( (this.tabDoJogo).hashCode() );
			ret = ret * 7 + new Integer ( (this.marca).hashCode() );


		        return ret;
    }
}