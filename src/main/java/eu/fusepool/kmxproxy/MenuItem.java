package eu.fusepool.kmxproxy;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.stanbol.commons.web.base.NavigationLink;

@Component
@Service(NavigationLink.class)
public class MenuItem extends NavigationLink {
    
    public MenuItem() {
        super("kmxproxy/", 
                "KMX RDF Proxy", 
                "Exposes external KMX service", 300);
    }
    
}
