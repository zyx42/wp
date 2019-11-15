<template>
  <div id="app">
    <div>
      <h1>WIZARDS POWERS</h1>
      <h3>Wizards of all nations, assemble!</h3>
    </div>
    <nav>
      <router-link to="/wizards">Wizards</router-link>
      <router-link to="/addWizard">Add a wizard</router-link>
    </nav>
    <wizards-list></wizards-list>
  </div>
</template>

<script>
import WizardsList from "./components/WizardsList";


export default {
  name: 'app',
  components: {
    WizardsList
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
