package org.eugenarium.wizardpowers.persistence.repository;

import org.eugenarium.wizardpowers.persistence.domain.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> {
}
