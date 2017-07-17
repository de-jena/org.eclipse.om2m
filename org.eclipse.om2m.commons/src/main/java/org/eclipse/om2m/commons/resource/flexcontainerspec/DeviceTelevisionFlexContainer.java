/*
Device : DeviceTelevision



A stelevision (TV) is a home appliance used to show audio and visual content such as broadcasting programs and network streaming. This TV information model provides capabilities to control and monitor TV specific resources.

Created: 2017-07-17 15:25:54
*/

package org.eclipse.om2m.commons.resource.flexcontainerspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.om2m.commons.resource.AbstractFlexContainer;


@XmlRootElement(name = DeviceTelevisionFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = DeviceTelevisionFlexContainer.SHORT_NAME, namespace = "http://www.onem2m.org/xml/protocols/homedomain")
public class DeviceTelevisionFlexContainer extends AbstractFlexContainer {
	
	public static final String LONG_NAME = "deviceTelevision";
	public static final String SHORT_NAME = "devTn";
	
	public DeviceTelevisionFlexContainer () {
		setContainerDefinition("org.onem2m.home.device." + LONG_NAME);
		setLongName(LONG_NAME);
		setShortName(SHORT_NAME);
	}
	
	public void finalizeSerialization() {
		getBinarySwitch();
		getAudioVolume();
		getTelevisionChannel();
		getAudioVideoInput();
	}
	
	@XmlElement(name="binSh", required=true, type=BinarySwitchFlexContainer.class)
	private BinarySwitchFlexContainer binarySwitch;
	
	
	public void setBinarySwitch(BinarySwitchFlexContainer binarySwitch) {
		this.binarySwitch = binarySwitch;
		getFlexContainerOrContainerOrSubscription().add(binarySwitch);
	}
	
	public BinarySwitchFlexContainer getBinarySwitch() {
		this.binarySwitch = (BinarySwitchFlexContainer) getResourceByName(BinarySwitchFlexContainer.SHORT_NAME);
		return binarySwitch;
	}
	
	@XmlElement(name="audVe", required=true, type=AudioVolumeFlexContainer.class)
	private AudioVolumeFlexContainer audioVolume;
	
	
	public void setAudioVolume(AudioVolumeFlexContainer audioVolume) {
		this.audioVolume = audioVolume;
		getFlexContainerOrContainerOrSubscription().add(audioVolume);
	}
	
	public AudioVolumeFlexContainer getAudioVolume() {
		this.audioVolume = (AudioVolumeFlexContainer) getResourceByName(AudioVolumeFlexContainer.SHORT_NAME);
		return audioVolume;
	}
	
	@XmlElement(name="telCl", required=true, type=TelevisionChannelFlexContainer.class)
	private TelevisionChannelFlexContainer televisionChannel;
	
	
	public void setTelevisionChannel(TelevisionChannelFlexContainer televisionChannel) {
		this.televisionChannel = televisionChannel;
		getFlexContainerOrContainerOrSubscription().add(televisionChannel);
	}
	
	public TelevisionChannelFlexContainer getTelevisionChannel() {
		this.televisionChannel = (TelevisionChannelFlexContainer) getResourceByName(TelevisionChannelFlexContainer.SHORT_NAME);
		return televisionChannel;
	}
	
	@XmlElement(name="auVIt", required=true, type=AudioVideoInputFlexContainer.class)
	private AudioVideoInputFlexContainer audioVideoInput;
	
	
	public void setAudioVideoInput(AudioVideoInputFlexContainer audioVideoInput) {
		this.audioVideoInput = audioVideoInput;
		getFlexContainerOrContainerOrSubscription().add(audioVideoInput);
	}
	
	public AudioVideoInputFlexContainer getAudioVideoInput() {
		this.audioVideoInput = (AudioVideoInputFlexContainer) getResourceByName(AudioVideoInputFlexContainer.SHORT_NAME);
		return audioVideoInput;
	}
	
}