package com.javaex.ex09;

public class TV {
	
	//필드
	private int channel, volume;
	private boolean power;
	
	//생성자
	public TV() {}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//메소드 getter
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	
	//메소드 - 일반
	public void power(boolean on) {
		if(on == true) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	
	public void channel(int channel) {
		if(this.power == true) {	//TV가 켜져있을 때
			if(channel > 255) {
				this.channel = 255;
			}else if(channel < 1) {
				this.channel = 1;
			}else {
				this.channel = channel;
			}
		}else {	//TV가 꺼져있을 때, 실행이 안되고, TV상태를 보여줌
			status();
		}
	}	
	
	public void channel(boolean up) {
		if(this.power == true) {	
			if(up == true) {
				if(channel == 255) {
					this.channel = 255;
				}else{
					this.channel += 1;
				}
			}else{
				if(channel == 1) {
					this.channel = 1;
				}else {
					this.channel -= 1;
				}
			}
		}else {
			status();
		}
	}
	
	public void volume(int volume) {
		if(this.power == true) {	
			if(volume > 100) {
				this.volume = 100;
			}else if(volume < 0) {
				this.volume = 0;
			}else {
				this.volume = volume;
			}
		}else {
			status();
		}
	}	
	
	public void volume(boolean up) {
		if(this.power == true) {	
			if(up == true) {
				if(volume == 100) {
					this.volume = 100;
				}else{
					this.volume += 1;
				}
			}else{
				if(volume == 0) {
					this.volume = 0;
				}else {
					this.volume -= 1;
				}
			}
		}else {
			status();
		}
	}
	
	public void status() {
		if(this.power == true) {
			System.out.println("[Channel] : " +this.channel+ " [Volume] : " +this.volume);
		}else {
			System.out.println("TV is off");
		}
	}
	
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	
}
