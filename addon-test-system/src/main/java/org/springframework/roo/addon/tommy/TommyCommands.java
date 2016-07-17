package org.springframework.roo.addon.tommy;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.springframework.roo.shell.CliAvailabilityIndicator;
import org.springframework.roo.shell.CliCommand;
import org.springframework.roo.shell.CliOption;
import org.springframework.roo.shell.CommandMarker;

/**
 * Commands for addon-git.
 * 
 * @author Stefan Schmidt
 * @since 1.1
 */
@Component
@Service
public class TommyCommands implements CommandMarker {

    @Reference private TommyOperations tommyOperations;

    @CliCommand(value = "tommy test", help = "Tommy For Test")
    public void config( @CliOption(key = { "message" }, mandatory = true, help = "The commit message") final String message) {
        tommyOperations.tommyTest(message);
    }

}
