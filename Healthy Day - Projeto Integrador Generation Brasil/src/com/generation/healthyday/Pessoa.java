package com.generation.healthyday;

public class Pessoa {

	// Atributos
	private String nome = "";
	private int idade = 0;
	private int sexo = 0;
	private double peso = 0.0;
	private double altura = 0;
	private int qtdeAgua = 0;
	private int qtdeRefeicoes = 0;
	private int objetivo = 0;
	private int ativFisica = 0;
	private double imc = 0.0;
	private double tmb = 0.0;
	private double tdee = 0.0;
	private double tdeeFinal = 0.0;
	private int aguaNecessaria = 0;
	private int aguaRestante = 0;

	// Construtor
	public Pessoa(final String nome, int idade, int sexo, double peso, double altura, int qtdeAgua, int qtdeRefeicoes,
			int objetivo, int ativFisica, double imc, double tmb, double tdee, double tdeeFinal, int aguaNecessaria,
			int aguaRestante) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.qtdeAgua = qtdeAgua;
		this.qtdeRefeicoes = qtdeRefeicoes;
		this.objetivo = objetivo;
		this.ativFisica = ativFisica;
		this.imc = imc;
		this.tmb = tmb;
		this.tdee = tdee;
		this.tdeeFinal = tdeeFinal;
		this.aguaNecessaria = aguaNecessaria;
		this.aguaRestante = aguaRestante;

	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getQtdeAgua() {
		return qtdeAgua;
	}

	public void setQtdeAgua(int qtdeAgua) {
		this.qtdeAgua = qtdeAgua;
	}

	public int getQtdeRefeicoes() {
		return qtdeRefeicoes;
	}

	public void setQtdeRefeicoes(int qtdeRefeicoes) {
		this.qtdeRefeicoes = qtdeRefeicoes;
	}

	public int getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(int objetivo) {
		this.objetivo = objetivo;
	}

	public int getAtivFisica() {
		return ativFisica;
	}

	public void setAtivFisica(int ativFisica) {
		this.ativFisica = ativFisica;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public double getTmb() {
		return tmb;
	}

	public void setTmb(double tmb) {
		this.tmb = tmb;
	}

	public double getTdee() {
		return tdee;
	}

	public void setTdee(double tdee) {
		this.tdee = tdee;
	}

	public double getTdeeFinal() {
		return tdeeFinal;
	}

	public void setTdeeFinal(double tdeeFinal) {
		this.tdeeFinal = tdeeFinal;
	}

	public int getAguaNecessaria() {
		return aguaNecessaria;
	}

	public void setAguaNecessaria(int aguaNecessaria) {
		this.aguaNecessaria = aguaNecessaria;
	}

	public int getAguaRestante() {
		return aguaRestante;
	}

	public void setAguaRestante(int aguaRestante) {
		this.aguaRestante = aguaRestante;
	}

	// Métodos (Cálculos)
	public double calcularImc(double peso, double altura) {
		return getPeso() / ((getAltura() / 100) * (getAltura() / 100));
	}

	public double calcularTmbFeminino(double peso, double altura, int idade) {
		return (10 * getPeso()) + (6.25 * getAltura()) - (5 * getIdade()) - 161;
	}

	public double calcularTmbMasculino(double peso, double altura, int idade) {
		return (10 * getPeso()) + (6.25 * getAltura()) - (5 * getIdade()) + 5;
	}

	public double calcularTdeeLeve(double tmb) {
		return getTmb() * 1.2;
	}

	public double calcularTdeeModerado(double tmb) {
		return getTmb() * 1.5;
	}

	public double calcularTdeeIntenso(double tmb) {
		return getTmb() * 1.7;
	}

	public double calcularTdeeFinalPerderPeso(double tdee) {
		return getTdee() * 0.8;
	}

	public double calcularTdeeFinalGanharPeso(double tdee) {
		return getTdee() * 1.2;
	}

	public double calcularAgua(double peso) {
		return getPeso() * 35;
	}

	public double calcularAguaRestante(double qtdeAgua, double aguaNecessaria) {
		return getAguaNecessaria() - getQtdeAgua();
	}

}