//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Supplementary instructions advice.
 * 
 * <p>Java class for Instructions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instructions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Advice">
 *       &lt;sequence>
 *         &lt;element name="instruction" type="{http://datex2.eu/schema/1_0/1_0}InstructionsEnum"/>
 *         &lt;element name="instructionsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instructions", propOrder = {
    "instruction",
    "instructionsExtension"
})
public class Instructions
    extends Advice
{

    @XmlElement(required = true)
    protected InstructionsEnum instruction;
    protected ExtensionType instructionsExtension;

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionsEnum }
     *     
     */
    public InstructionsEnum getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionsEnum }
     *     
     */
    public void setInstruction(InstructionsEnum value) {
        this.instruction = value;
    }

    /**
     * Gets the value of the instructionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInstructionsExtension() {
        return instructionsExtension;
    }

    /**
     * Sets the value of the instructionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInstructionsExtension(ExtensionType value) {
        this.instructionsExtension = value;
    }

}
