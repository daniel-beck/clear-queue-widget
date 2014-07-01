package org.jenkinsci.plugins.clearqueuewidget;

import hudson.Plugin;
import hudson.util.HttpResponses;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.HttpResponse;
import org.kohsuke.stapler.interceptor.RequirePOST;

import javax.servlet.ServletException;
import java.io.IOException;

public class PluginImpl extends Plugin {
    @RequirePOST
    public HttpResponse doClearQueue() throws IOException, ServletException {
        Jenkins.getInstance().checkPermission(Jenkins.ADMINISTER);
        Jenkins.getInstance().getQueue().clear();
        return HttpResponses.forwardToPreviousPage();
    }
}
