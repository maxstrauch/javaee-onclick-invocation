package de.test;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * Nur Demo-Daten für die Demo-List. Mehr nicht.
 * 
 * @author maximilianstrauch
 */
@SessionScoped
@Named
public class DataSource implements Serializable {
    
    private List<ContainerObj> options;

    @PostConstruct
    private void init() {
        options = new ArrayList<>();
        options.add(new ContainerObj("Option 42"));
        options.add(new ContainerObj("Option 21"));
        options.add(new ContainerObj("Option 15"));
    }
    
    public List<ContainerObj> getOptions() {
        return options;
    }

    public void setOptions(List<ContainerObj> options) {
        this.options = options;
    }
    
}
