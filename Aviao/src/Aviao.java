public class Aviao {
    private int numeroAviao;
    private double peso;
    private double velocidadeMax = 1200;
    private double velocidadeDecolar = 300;
    private double velocidadeMin = 0;
    private boolean ligado = false;
    private double velocidadeAtual = 0;

    public Aviao(int i, double v) {
    }


    //-------------------------------------------------------------
    public void ligar() {
        if (this.ligado) {
            System.out.println("O avião já está ligado!!");
        } else {
            this.ligado = true;
            System.out.println("O avião está ligado!!");
        }
    }

    //-----------------------------------------------------------------
    public void desligar() {
        if (this.velocidadeAtual == 0) {
            if (this.ligado) {
                this.ligado = false;
                System.out.println("Desligamos o avião");
            } else {
                System.out.println("O avião já está desligado");
            }
        } else {
            System.out.println("O avião precisa estar parado para ligar");
        }
    }
//------------------------------------------------------------------

    public void acelerar(double valorDeAceleracao) {
        if (this.ligado) {
            if (this.velocidadeMax < this.velocidadeAtual + valorDeAceleracao) {
                System.out.println("você não pode ultrapassar a velocidade máxima!");
                this.velocidadeAtual = this.velocidadeMax;
                System.out.println("O avião está à " + this.velocidadeAtual + " km/h");

            } else {
                this.velocidadeAtual += valorDeAceleracao;
                System.out.println("O avião está à " + this.velocidadeAtual + " km/h");
            }
        } else {
            System.out.println("Você não pode acelerar o avião desligado!");

        }


    }

    //------------------------------------------------------------------
    public void frear(double valorDeFrenagem) {
        if (this.ligado) {
            if (this.velocidadeMin <= this.velocidadeAtual - valorDeFrenagem) {
                this.velocidadeAtual -= valorDeFrenagem;
                if (this.velocidadeAtual == 0.0) {
                    System.out.println("O avião está parado!");
                } else {
                    System.out.println("O avião está a " + this.velocidadeAtual + " km/h.");
                }
            } else {
                this.velocidadeAtual = 0;
                System.out.println("O avião parou!");
            }
        } else {
            System.out.println("Você não pode frear um avião desligado!");
        }


    }

    //------------------------------------------------------------------
    public void pousar() {
        if (this.ligado) {
            if (this.velocidadeAtual > 300) {
                this.velocidadeAtual = 300;
                System.out.println("Reduzido velocidade abaixo de 300 Km/h para o pouso!!");
            }
            if (this.velocidadeAtual < 300) ;
            System.out.println("O avião irá pousar!!");
        } else {
            System.out.println("o avião já em terra!!");

        }
    }

    //------------------------------------------------------------------------
    public void decolar() {
        if (this.ligado) {
            if (this.velocidadeAtual > 300) {
                this.velocidadeAtual = 300;
                System.out.println("O avião irá decolar!!");

            } else {
                System.out.println("o avião já decolou!!");
            }
        } else {
            System.out.println("o avião está desligado e parado!");
        }
    }

//------------------------------------------------------------------

    public void parar() {
        if (this.ligado) {
            if (this.velocidadeAtual > 0) {
                this.velocidadeAtual = 0;
                System.out.println("O avião parou!!");

            } else {
                System.out.println("o avião já está parado!!");
            }
        } else {
            System.out.println("o avião está desligado e parado!");
        }
    }
}
//------------------------------------------------------------------

