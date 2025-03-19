public class Teatro {
    private String nome;
    private int numeroPosti;
private Boolean[] posti;

    public Teatro(String nome, int numeroPosti) {
        this.nome = nome;
        this.numeroPosti = numeroPosti;
        posti = new Boolean[numeroPosti];
        for(int i = 0; i < posti.length; i++)
        {posti[i] = false;}
    }

    private String getNome() {
        return nome;
    }

    private int getNumeroPosti() {
        return numeroPosti;
    }

    public Boolean[] getPosti() {
        return posti;
    }
    private boolean isDisponibile(int numposto){
        if(this.posti[numposto] == false){
            return true;
        }
        else{
            return false;
        }

    }
    public void guardaposti(){
        System.out.println("Posti di teatro : "+this.getNumeroPosti());
        for(int i = 0; i < posti.length; i++)
        {
            System.out.print((i+1)+" "+posti[i]+" \n");
        }


    }



    public void prenotaPosto(int posto) throws PostoGiaOccupatoException, PostoNonValidoException {
        if (posto <= 0 || posto > this.posti.length) {
            throw new PostoNonValidoException("Il posto non esiste!");
        }

        if (this.posti[posto - 1]) {
            throw new PostoGiaOccupatoException("Il posto è già occupato!");
        }


        this.posti[posto - 1] = true;
        System.out.println("Il posto è prenotato");
    }


    public boolean liberarePosto(int posto)
    {
        try {
            this.posti = posti;
           return this.posti[posto] = false;

        }catch (Exception e) {
            this.posti[posto] = true;
            System.out.println(e);
            return this.posti[posto];
        }

    }
    public int numPosti()
    {
        return this.posti.length;
    }
    @Override
    public String toString() {
        return "Nome del teatro: " + this.getNome() + "\n";

    }
}
