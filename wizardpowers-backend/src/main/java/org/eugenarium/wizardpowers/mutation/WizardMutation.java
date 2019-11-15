package org.eugenarium.wizardpowers.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.eugenarium.wizardpowers.persistence.domain.Wizard;
import org.eugenarium.wizardpowers.persistence.service.WizardService;
import org.springframework.stereotype.Component;

@Component
public class WizardMutation implements GraphQLMutationResolver {

    private WizardService wizardService;

    public WizardMutation(WizardService wizardService) {
        this.wizardService = wizardService;
    }

    public Wizard addWizard(String type, String name, int powerLevel) {
        return this.wizardService.addWizard(type, name, powerLevel);
    }
}
