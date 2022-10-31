package core;



public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	
	public Time(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Time(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;
	}
	
	public Time(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void setTime(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;
	}
	
	public void setTime(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public String exibirHoraUniversal() {
		return formatarNumero(hora) + ":" + formatarNumero(minuto) + ":" + formatarNumero(segundo);
	}
	
	public String exibirHoraPadrao() {
		/*
		 4 casos:
		 1. 0h - 12AM
		 2. 12h - 12PM
		 3. Entre 1 e 11 - horaAM
		 4. Entre 13 e 23 (hora - 12) PM
		 */
		
		String sufixo;
		String horaPadrao;
		if (hora == 0) {
			horaPadrao = "12";
			sufixo = "AM";
		}
		else if (hora == 12) {
			horaPadrao = "12";
			sufixo = "PM";
		}
		else if (hora > 0 && hora < 12) {
			horaPadrao = String.valueOf(formatarNumero(hora));
			sufixo = "AM";
		}
		else {
			horaPadrao = String.valueOf(formatarNumero(hora - 12));
			sufixo = "PM";
		}
		return horaPadrao + ":" + formatarNumero(this.minuto) +":"+formatarNumero(this.segundo)+sufixo;
	}
	
	private String formatarNumero(int num) {
		if (num < 10) {
			return "0" + num;
		}
		return String.valueOf(num);
	}

}
