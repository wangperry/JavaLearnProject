package workflow;

import com.opensymphony.workflow.Workflow;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.basic.BasicWorkflow;
import com.opensymphony.workflow.config.DefaultConfiguration;
import com.opensymphony.workflow.spi.Step;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-9-23 下午4:14
 */
public class Driver {

    @Test
    public void testWorkFlow(){
        /*这样我们来创建一个'testuser'调用的workflow:*/
        Workflow workflow = new BasicWorkflow("testuser");

        DefaultConfiguration config = new DefaultConfiguration();

        workflow.setConfiguration(config);

        try {
            long workflowId = workflow.initialize("mytest", 1, null);

            Collection currentSteps = workflow.getCurrentSteps(workflowId);

            assertEquals("Unexpected number of current steps",1, currentSteps.size());

            Step currentStep = (Step)currentSteps.iterator().next();
            assertEquals("Unexpected current step", 1,currentStep.getStepId());

            int[] availableActions = workflow.getAvailableActions(workflowId);
            //校验只有一个可执行的动作
            assertEquals("Unexpected number of available actions", 1, availableActions.length);
            //校验这个步骤是1
            assertEquals("Unexpected available action", 1, availableActions[0]);

            workflow.doAction(workflowId, 1, null);


        } catch (WorkflowException e) {
            e.printStackTrace();
        }


    }

}
