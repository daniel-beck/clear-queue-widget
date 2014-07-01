package org.jenkinsci.plugins.clearqueuewidget;

import hudson.Extension;
import hudson.util.HttpResponses;
import hudson.widgets.Widget;
import jenkins.model.Jenkins;
import org.kohsuke.stapler.HttpResponse;
import org.kohsuke.stapler.interceptor.RequirePOST;

import javax.servlet.ServletException;
import java.io.IOException;

@Extension(ordinal=190)
public class ClearQueueWidget extends Widget {
    public boolean isShowButton() {
        return !Jenkins.getInstance().getQueue().isEmpty();
    }
}
