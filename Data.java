public class Data {

    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        if(dia<31 && mes<12){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else{
            System.out.println("Data inválida! Alterando para a data padrão: 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
    public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            return true;
        }
        else {
            return false;
        }

    }
    public int compareTo(Data outraData) {
        if (this.ano != outraData.getAno()) {
            return this.ano - outraData.getAno();
        } else if (this.mes != outraData.getMes()) {
            return this.mes - outraData.getMes();
        } else {
            return this.dia - outraData.getDia();
        }
    }


}

