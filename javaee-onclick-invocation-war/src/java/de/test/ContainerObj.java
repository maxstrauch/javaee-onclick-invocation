package de.test;


/**
 *
 * @author maximilianstrauch
 */
public class ContainerObj {
    
    private String value;
    private boolean selected;

    public ContainerObj(String value) {
        this.value = value;
        this.selected = false;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
    /**
     * Diese Methode wird ausgeführt, sobald eine Checkbox angeklickt wird.
     */
    public void onClick() {
        System.out.println("CHECKBOX ANGEKLICKT: value = " + value + ", selected? " + selected);
    }
    
}
