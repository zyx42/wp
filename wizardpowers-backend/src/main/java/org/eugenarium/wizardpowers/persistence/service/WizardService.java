package org.eugenarium.wizardpowers.persistence.service;

import org.eugenarium.wizardpowers.persistence.domain.Wizard;

import java.util.List;
import java.util.Optional;

public interface WizardService {

    public Optional<Wizard> getWizard(Long id);
    public List<Wizard> getWizards();
    public Wizard addWizard(String type, String name, int powerLevel);
}
