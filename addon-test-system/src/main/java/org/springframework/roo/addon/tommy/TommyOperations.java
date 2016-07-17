package org.springframework.roo.addon.tommy;

/**
 * Operations offered by Git addon.
 * 
 * @author Stefan Schmidt
 * @since 1.1
 */
public interface TommyOperations {

    /**
     * Triggers commit for all changes in the Git tree. (works like 'git commmit
     * -a -m {message}')
     * 
     * @param message Commit message
     */
    void tommyTest(String message);


}
