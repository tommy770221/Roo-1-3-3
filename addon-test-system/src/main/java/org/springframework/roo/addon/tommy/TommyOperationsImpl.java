package org.springframework.roo.addon.tommy;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.apache.commons.io.IOUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.springframework.roo.process.manager.FileManager;
import org.springframework.roo.project.Path;
import org.springframework.roo.project.PathResolver;
import org.springframework.roo.support.util.FileUtils;

/**
 * Operations for Git addon.
 * 
 * @author Stefan Schmidt
 * @since 1.1
 */
@Component
@Service
public class TommyOperationsImpl implements TommyOperations {

    private static final Logger LOGGER = Logger
            .getLogger(TommyOperationsImpl.class.getName());
    private static final String REVISION_STRING_DELIMITER = "~";

    @Reference private FileManager fileManager;
    @Reference private PathResolver pathResolver;




    @Override
    public void tommyTest(String message) {
        System.out.println("Do Tommy message"+message);
    }
}
