package com.marco.CalculodeJuros;
public class Juros {
    
    private double valorP;
    private static final double TAXA_DE_JUROS = 0.10;
    
    public Juros(double valorP) {
        this.valorP = valorP;
    }
    
  public double valorAlterado() {
    if (valorP <= 0) {
        throw new IllegalArgumentException("Valor do produto não pode ser negativo ou igual a zero");
    }
    double juros = valorP * TAXA_DE_JUROS;
    return valorP + juros;
   }

public double getValorP() {
    return valorP;
}

public void setValorP(double valorP) {
    this.valorP = valorP;
}

public static double getTaxaDeJuros() {
    return TAXA_DE_JUROS;
}
}
