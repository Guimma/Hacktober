class Instituicao{
  private int codigo;
  private String nome;
  private String sigla;
  private int codigoMantenedora;
  private String mantenedora;
  private int categoria;
  private int organizacao;
  private int codigoMunicipio;
  private String municipio;
  private String uf;
  private String regiao;
  private int tecnico;
  private int periodico;
  private int livro;
  private double receita;
  private double transferencia;
  private double outraReceita;
  private double despesaDocente;
  private double despesaTecnico;
  private double despesaEncargo;
  private double despesaCusteio;
  private double despesaInvestimento;
  private double despesaPesquisa;
  private double despesaOutras;

  public Instituicao(){
          codigo = 0;
          nome = "";
          sigla = "";
          codigoMantenedora = 0;
          mantenedora = "";
          categoria = 0;
          organizacao = 0;
          codigoMunicipio = 0;
          municipio = "";
          uf = "";
          regiao = "";
          tecnico = 0;
          periodico = 0;
          receita = 0;
          livro = 0;
          transferencia = 0;
          outraReceita = 0;
          despesaDocente = 0;
          despesaTecnico = 0;
          despesaEncargo = 0;
          despesaCusteio = 0;
          despesaInvestimento = 0;
          despesaPesquisa = 0;
          despesaOutras =0;
  }

        public Instituicao(int codigo, String nome, String sigla){
                this.codigo = codigo;
                this.nome = nome;
                this.sigla = sigla;
                codigoMantenedora = 0;
                mantenedora = "";
                categoria = 0;
                organizacao = 0;
                codigoMunicipio = 0;
                municipio = "";
                uf = "";
                regiao = "";
                tecnico = 0;
                periodico = 0;
                livro = 0;
                receita = 0;
                transferencia = 0;
                outraReceita = 0;
                despesaDocente = 0;
                despesaTecnico = 0;
                despesaEncargo = 0;
                despesaCusteio = 0;
                despesaInvestimento = 0;
                despesaPesquisa = 0;
                despesaOutras =0;
        }
  

        public void setCodigo(String codigo){
          this.codigo = Integer.parseInt(codigo);
        }
        public int getCodigo(){
          return (codigo);
        }

        public void setNome(String nome){
                this.nome = nome;
        }
        public String getNome(){
                return (nome);
        }

        public void setSigla(String sigla){
                this.sigla = sigla;
        }
        public String getSigla(){
                return (sigla);
        }
  
        public void setCodigoMantenedora(String codigoMantenedora){
                this.codigoMantenedora = Integer.parseInt(codigoMantenedora);
        }
        public int getCodigoMantenedora(){
                return (codigoMantenedora);
        }
  
        public void setMantenedora(String mantenedora){
                this.mantenedora = mantenedora;
        }
        public String getMantenedora(){
                return (mantenedora);
        }

        public void setCategoria(String categoria){
                this.categoria = Integer.parseInt(categoria);
        }
        public int getCategoria(){
                return (categoria);
        }
  
        public void setOrganizacao(String organizacao){
                this.organizacao = Integer.parseInt(organizacao);
        }
        public int getOrganizacao(){
                return (organizacao);
        }    

        public void setCodigoMunicipio(String codigoMunicipio){
                this.codigoMunicipio = Integer.parseInt(codigoMunicipio);
        }
        public int getCodigoMunicipio(){
                return (codigoMunicipio);
        }    

        public void setMunicipio(String municipio){
                this.municipio = municipio;
        }
        public String getMunicipio(){
                return (municipio);
        }   

        public void setUf(String uf){
                this.uf = uf;
        }
        public String getUf(){
                return (uf);
        }  

        public void setRegiao(String regiao){
                this.regiao = regiao;
        }
        public String getRegiao(){
                return (regiao);
        }  

        public void setTecnico(String tecnico){
                this.tecnico = Integer.parseInt(tecnico);
        }
        public int getTecnico(){
                return (tecnico);
        }  

        public void setPeriodico(String periodico){
                this.periodico = Integer.parseInt(periodico);
        }
        public int getPeriodico(){
                return (periodico);
        } 

        public void setLivro(String livro){
                this.livro = Integer.parseInt(livro);
        }
        public int getLivro(){
                return (livro);
        }   

        public void setReceita(String receita){
                this.receita = Double.parseDouble(receita);
        }
        public double getReceita(){
                return (receita);
        }               

        public void setTransferencia(String transferencia){
                this.transferencia = Double.parseDouble(transferencia);
        }
        public double getTransferencia(){
                return (transferencia);
        }  

        public void setOutraReceita(String outraReceita){
                this.outraReceita = Double.parseDouble(outraReceita);
        }
        public double getOutraReceita(){
                return (outraReceita);
        }

        public void setDespesaDocente(String despesaDocente){
                this.despesaDocente = Double.parseDouble(despesaDocente);
        }
        public double getDespesaDocente(){
                return (despesaDocente);
        }  

        public void setDespesaTecnico(String despesaTecnico){
                this.despesaTecnico = Double.parseDouble(despesaTecnico);
        }
        public double getDespesaTecnico(){
                return (despesaTecnico);
        } 

        public void setDespesaEncargo(String despesaEncargo){
                this.despesaEncargo = Double.parseDouble(despesaEncargo);
        }
        public double getDespesaEncargo(){
                return (despesaEncargo);
        }   

        public void setDespesaCusteio(String despesaCusteio){
                this.despesaCusteio = Double.parseDouble(despesaCusteio);
        }
        public double getDespesaCusteio(){
                return (despesaCusteio);
        }         

        public void setDespesaInvestimento(String despesaInvestimento){
                this.despesaInvestimento = Double.parseDouble(despesaInvestimento);
        }
        public double getDespesaInvestimento(){
                return (despesaInvestimento);
        }

        public void setDespesaPesquisa(String despesaPesquisa){
                this.despesaPesquisa = Double.parseDouble(despesaPesquisa);
        }
        public double getDespesaPesquisa(){
                return (despesaPesquisa);
        }

        public void setDespesaOutras(String despesaOutras){
                this.despesaOutras = Double.parseDouble(despesaOutras);
        }
        public double getDespesaOutras(){
                return (despesaOutras);
        }

        public Instituicao clone(){
                Instituicao clone = new Instituicao();
                clone.setCodigo("" + this.getCodigo());
                clone.setNome("" + this.getNome());
                clone.setSigla("" + this.getSigla());
                clone.setCodigoMantenedora("" + this.getCodigoMantenedora());
                clone.setMantenedora("" + this.getMantenedora());
                clone.setCategoria("" + this.getCategoria());
                clone.setOrganizacao("" + this.getOrganizacao());
                clone.setCodigoMunicipio("" + this.getCodigoMunicipio());
                clone.setMunicipio("" + this.getMunicipio());
                clone.setUf("" + this.getUf());
                clone.setRegiao("" + this.getRegiao());
                clone.setTecnico("" + this.getTecnico());
                clone.setPeriodico("" + this.getPeriodico());
                clone.setLivro("" + this.getLivro());
                clone.setReceita("" + this.getReceita());
                clone.setTransferencia("" + this.getTransferencia());
                clone.setOutraReceita("" + this.getOutraReceita());
                clone.setDespesaDocente("" + this.getDespesaDocente());
                clone.setDespesaTecnico("" + this.getDespesaTecnico());
                clone.setDespesaEncargo("" + this.getDespesaEncargo());
                clone.setDespesaCusteio("" + this.getDespesaCusteio());
                clone.setDespesaInvestimento("" + this.getDespesaInvestimento());
                clone.setDespesaPesquisa("" + this.getDespesaPesquisa());
                clone.setDespesaOutras("" + this.getDespesaOutras());           

                return(clone);
        }

        public void imprimir(){
                MyIO.print("" + this.getCodigo());
                MyIO.print(" " + this.getNome());
                MyIO.print(" " + this.getSigla());
                MyIO.print(" " + this.getCodigoMantenedora());
                MyIO.print(" " + this.getMantenedora());
                MyIO.print(" " + this.getCategoria());
                MyIO.print(" " + this.getOrganizacao());
                MyIO.print(" " + this.getCodigoMunicipio());
                MyIO.print(" " + this.getMunicipio());
                MyIO.print(" " + this.getUf());
                MyIO.print(" " + this.getRegiao());
                MyIO.print(" " + this.getTecnico());
                MyIO.print(" " + this.getPeriodico());
                MyIO.print(" " + this.getLivro());
                MyIO.print(" " + this.getReceita());
                MyIO.print(" " + this.getTransferencia());
                MyIO.print(" " + this.getOutraReceita());
                MyIO.print(" " + this.getDespesaDocente());
                MyIO.print(" " + this.getDespesaTecnico());
                MyIO.print(" " + this.getDespesaEncargo());
                MyIO.print(" " + this.getDespesaCusteio());
                MyIO.print(" " + this.getDespesaInvestimento());
                MyIO.print(" " + this.getDespesaPesquisa());
                MyIO.println(" " + this.getDespesaOutras());                
        }

        public void ler( int linha ){
                int i = 1;
                String [] info  = new String[0];
                String dados = "";
             
                Arq.openRead("/tmp/censo.dat","ISO-8859-1");                

                while( i<=linha ){
                        Arq.readLine();
                        i++;
                }
                dados = Arq.readLine();
                info = dados.split("\t"); 
                this.setCodigo( info[0] );
                this.setNome( info[1] );
                this.setSigla( info[2] );
                this.setCodigoMantenedora( info[3] );
                this.setMantenedora( info[4] );
                this.setCategoria( info[5] );
                this.setOrganizacao( info[6] );
                this.setCodigoMunicipio( info[7] );
                this.setMunicipio( info[8] );
                this.setUf( info[9] );
                this.setRegiao( info[10] );
                this.setTecnico( info[11] );
                this.setPeriodico( info[12] );
                this.setLivro( info[13] );
                this.setReceita( info[14] );
                this.setTransferencia( info[15] );
                this.setOutraReceita( info[16] );
                this.setDespesaDocente( info[17] );
                this.setDespesaTecnico( info[18] );
                this.setDespesaEncargo( info[19] );
                this.setDespesaCusteio( info[20] );
                this.setDespesaInvestimento( info[21] );
                this.setDespesaPesquisa( info[22] );
                this.setDespesaOutras( info[23] );           

                Arq.close();  
        }
}

class Lista {
   private Instituicao [] lista;
   private int n;
   public int comp = 0;
   public int mov = 0;
   public int k = 0;

   public Lista () {
      this(6);
   }

   public Lista (int tamanho){
      lista = new Instituicao[tamanho];
      n = 0;
   }

   public void inserirFim(Instituicao x) throws Exception {

      //validar insercao
      if(n >= lista.length){
         throw new Exception("Erro ao inserir!");
      }

      lista[n] = x;
      n++;
   }

    public void swap( int i, int j ){
        Instituicao temp = lista[i];
        mov++;
        lista[i] = lista[j];
        mov++;
        lista[j] = temp;
        mov++;
        k++;
    }

    public void selecao(){
      int i, j, menor;
      Instituicao temp;

      if ( k<10 ) {
        for ( i=0; i<n; i++) {
          menor=i;
          for(j=i;j<n-1;j++){
              if(lista[j+1].getCodigo()<lista[menor].getCodigo())
                  menor=j+1;
                  comp++;
          }
          swap ( menor, i );
        }          
      }
    }
  
   public void mostrar (){
      for(int i = 0; i < 10; i++){
        lista[i].imprimir();
      }
   }
}
   
public class ex08{ 

  public static Instituicao getInstituicao( int linha ){
    Instituicao i = new Instituicao();
    i.ler( linha );
    return( i );
  }    

  public static void main(String[] args) throws Exception{
    Lista lista = new Lista( 1000 );
    int num = MyIO.readInt();

    while(num!=0){
      lista.inserirFim(getInstituicao(num));      
      num = MyIO.readInt();                      
    }

    long startTime = System.nanoTime();
    lista.selecao();   
    long endTime = System.nanoTime();
    
    double duration = (endTime - startTime)/1000000.0;
    
    lista.mostrar();
    
    Arq.openWrite("matricula_selecao2.txt");
    Arq.println("628817\t"+duration+"ms\t"+lista.comp+"\t"+lista.mov);
    Arq.close();
  }
}