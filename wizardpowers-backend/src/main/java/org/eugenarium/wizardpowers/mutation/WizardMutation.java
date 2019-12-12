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

    public Wizard updateWizard(Long id, String type, String name, int powerLevel) {
        Wizard wizard = wizardService.getWizard(id).get();
        wizard.setType(type);
        wizard.setName(name);
        wizard.setPowerLevel(powerLevel);

        return this.wizardService.updateWizard(wizard);
    }

    public Wizard deleteWizard(Long id) {
        return this.wizardService.deleteWizard(id);
    }
}
