package org.eugenarium.wizardpowers.persistence.service.Impl;

import org.eugenarium.wizardpowers.persistence.domain.Wizard;
import org.eugenarium.wizardpowers.persistence.repository.WizardRepository;
import org.eugenarium.wizardpowers.persistence.service.WizardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class WizardServiceImpl implements WizardService {

    private final WizardRepository wizardRepository;

    public WizardServiceImpl(WizardRepository wizardRepository) {
        this.wizardRepository = wizardRepository;
    }

    @Override
    public Optional<Wizard> getWizard(Long id) {
        return this.wizardRepository.findById(id);
    }

    @Override
    public List<Wizard> getWizards() {
        return this.wizardRepository.findAll();
    }

    @Override
    public Wizard addWizard(String type, String name, int powerLevel) {
        Wizard wizard = new Wizard();
        wizard.setType(type);
        wizard.setName(name);
        wizard.setPowerLevel(powerLevel);

        return this.wizardRepository.save(wizard);
    }
}
