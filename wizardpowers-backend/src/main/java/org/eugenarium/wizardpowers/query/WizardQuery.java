package org.eugenarium.wizardpowers.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.eugenarium.wizardpowers.persistence.domain.Wizard;
import org.eugenarium.wizardpowers.persistence.service.WizardService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class WizardQuery implements GraphQLQueryResolver {

    private WizardService wizardService;

    public WizardQuery(WizardService wizardService) {
        this.wizardService = wizardService;
    }

    public Optional<Wizard> getWizardById(Long id) {
        return this.wizardService.getWizard(id);
    }

    public List<Wizard> getWizards() {
        return this.wizardService.getWizards();
    }
}
