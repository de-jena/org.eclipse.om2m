/*
Device : DeviceAirConditionerAnnc



An air conditioner is a home appliance used to alter the properties of air (primarily temperature and humidity) to more comfortable conditions. This air conditioner information model provides capabilities to control and monitor air conditioner specific functions and resources.

Created: 2017-08-09 15:38:05
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;
import org.eclipse.om2m.commons.resource.AbstractFlexContainerAnnc;


@XmlRootElement(name = DeviceAirConditionerFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = DeviceAirConditionerFlexContainerAnnc.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class DeviceAirConditionerFlexContainerAnnc extends AbstractFlexContainerAnnc {
	
	public static final String LONG_NAME = "deviceAirConditionerAnnc";
	public static final String SHORT_NAME = "deACrAnnc";
	
	public DeviceAirConditionerFlexContainerAnnc () {
		setContainerDefinition("org.onem2m.home.device." + DeviceAirConditionerFlexContainer.LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
		getBinarySwitch();
		getBinarySwitchAnnc();
		getRunMode();
		getRunModeAnnc();
		getTemperature();
		getTemperatureAnnc();
		getTimer();
		getTimerAnnc();
		getTurbo();
		getTurboAnnc();
		getWind();
		getWindAnnc();
	}
	
	@XmlElement(name="binSh", required=true, type=BinarySwitchFlexContainerAnnc.class)
	private BinarySwitchFlexContainer binarySwitch;
	
	
	public void setBinarySwitch(BinarySwitchFlexContainer binarySwitch) {
		this.binarySwitch = binarySwitch;
		getFlexContainerOrContainerOrSubscription().add(binarySwitch);
	}
	
	public BinarySwitchFlexContainer getBinarySwitch() {
		this.binarySwitch = (BinarySwitchFlexContainer) getResourceByName(BinarySwitchFlexContainer.SHORT_NAME);
		return binarySwitch;
	}
	
	@XmlElement(name="binShAnnc", required=true, type=BinarySwitchFlexContainerAnnc.class)
	private BinarySwitchFlexContainerAnnc binarySwitchAnnc;
	
	
	public void setBinarySwitch(BinarySwitchFlexContainerAnnc binarySwitchAnnc) {
		this.binarySwitchAnnc = binarySwitchAnnc;
		getFlexContainerOrContainerOrSubscription().add(binarySwitchAnnc);
	}
	
	public BinarySwitchFlexContainerAnnc getBinarySwitchAnnc() {
		this.binarySwitchAnnc = (BinarySwitchFlexContainerAnnc) getResourceByName(BinarySwitchFlexContainerAnnc.SHORT_NAME);
		return binarySwitchAnnc;
	}
	
	@XmlElement(name="runMe", required=true, type=RunModeFlexContainerAnnc.class)
	private RunModeFlexContainer runMode;
	
	
	public void setRunMode(RunModeFlexContainer runMode) {
		this.runMode = runMode;
		getFlexContainerOrContainerOrSubscription().add(runMode);
	}
	
	public RunModeFlexContainer getRunMode() {
		this.runMode = (RunModeFlexContainer) getResourceByName(RunModeFlexContainer.SHORT_NAME);
		return runMode;
	}
	
	@XmlElement(name="runMeAnnc", required=true, type=RunModeFlexContainerAnnc.class)
	private RunModeFlexContainerAnnc runModeAnnc;
	
	
	public void setRunMode(RunModeFlexContainerAnnc runModeAnnc) {
		this.runModeAnnc = runModeAnnc;
		getFlexContainerOrContainerOrSubscription().add(runModeAnnc);
	}
	
	public RunModeFlexContainerAnnc getRunModeAnnc() {
		this.runModeAnnc = (RunModeFlexContainerAnnc) getResourceByName(RunModeFlexContainerAnnc.SHORT_NAME);
		return runModeAnnc;
	}
	
	@XmlElement(name="tempe", required=true, type=TemperatureFlexContainerAnnc.class)
	private TemperatureFlexContainer temperature;
	
	
	public void setTemperature(TemperatureFlexContainer temperature) {
		this.temperature = temperature;
		getFlexContainerOrContainerOrSubscription().add(temperature);
	}
	
	public TemperatureFlexContainer getTemperature() {
		this.temperature = (TemperatureFlexContainer) getResourceByName(TemperatureFlexContainer.SHORT_NAME);
		return temperature;
	}
	
	@XmlElement(name="tempeAnnc", required=true, type=TemperatureFlexContainerAnnc.class)
	private TemperatureFlexContainerAnnc temperatureAnnc;
	
	
	public void setTemperature(TemperatureFlexContainerAnnc temperatureAnnc) {
		this.temperatureAnnc = temperatureAnnc;
		getFlexContainerOrContainerOrSubscription().add(temperatureAnnc);
	}
	
	public TemperatureFlexContainerAnnc getTemperatureAnnc() {
		this.temperatureAnnc = (TemperatureFlexContainerAnnc) getResourceByName(TemperatureFlexContainerAnnc.SHORT_NAME);
		return temperatureAnnc;
	}
	
	@XmlElement(name="timer", required=true, type=TimerFlexContainerAnnc.class)
	private TimerFlexContainer timer;
	
	
	public void setTimer(TimerFlexContainer timer) {
		this.timer = timer;
		getFlexContainerOrContainerOrSubscription().add(timer);
	}
	
	public TimerFlexContainer getTimer() {
		this.timer = (TimerFlexContainer) getResourceByName(TimerFlexContainer.SHORT_NAME);
		return timer;
	}
	
	@XmlElement(name="timerAnnc", required=true, type=TimerFlexContainerAnnc.class)
	private TimerFlexContainerAnnc timerAnnc;
	
	
	public void setTimer(TimerFlexContainerAnnc timerAnnc) {
		this.timerAnnc = timerAnnc;
		getFlexContainerOrContainerOrSubscription().add(timerAnnc);
	}
	
	public TimerFlexContainerAnnc getTimerAnnc() {
		this.timerAnnc = (TimerFlexContainerAnnc) getResourceByName(TimerFlexContainerAnnc.SHORT_NAME);
		return timerAnnc;
	}
	
	@XmlElement(name="turbo", required=true, type=TurboFlexContainerAnnc.class)
	private TurboFlexContainer turbo;
	
	
	public void setTurbo(TurboFlexContainer turbo) {
		this.turbo = turbo;
		getFlexContainerOrContainerOrSubscription().add(turbo);
	}
	
	public TurboFlexContainer getTurbo() {
		this.turbo = (TurboFlexContainer) getResourceByName(TurboFlexContainer.SHORT_NAME);
		return turbo;
	}
	
	@XmlElement(name="turboAnnc", required=true, type=TurboFlexContainerAnnc.class)
	private TurboFlexContainerAnnc turboAnnc;
	
	
	public void setTurbo(TurboFlexContainerAnnc turboAnnc) {
		this.turboAnnc = turboAnnc;
		getFlexContainerOrContainerOrSubscription().add(turboAnnc);
	}
	
	public TurboFlexContainerAnnc getTurboAnnc() {
		this.turboAnnc = (TurboFlexContainerAnnc) getResourceByName(TurboFlexContainerAnnc.SHORT_NAME);
		return turboAnnc;
	}
	
	@XmlElement(name="wind", required=true, type=WindFlexContainerAnnc.class)
	private WindFlexContainer wind;
	
	
	public void setWind(WindFlexContainer wind) {
		this.wind = wind;
		getFlexContainerOrContainerOrSubscription().add(wind);
	}
	
	public WindFlexContainer getWind() {
		this.wind = (WindFlexContainer) getResourceByName(WindFlexContainer.SHORT_NAME);
		return wind;
	}
	
	@XmlElement(name="windAnnc", required=true, type=WindFlexContainerAnnc.class)
	private WindFlexContainerAnnc windAnnc;
	
	
	public void setWind(WindFlexContainerAnnc windAnnc) {
		this.windAnnc = windAnnc;
		getFlexContainerOrContainerOrSubscription().add(windAnnc);
	}
	
	public WindFlexContainerAnnc getWindAnnc() {
		this.windAnnc = (WindFlexContainerAnnc) getResourceByName(WindFlexContainerAnnc.SHORT_NAME);
		return windAnnc;
	}
	
}