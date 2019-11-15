import Vue from "vue";
import Router from "vue-router";
import Wizard from "./components/Wizard.vue";
import WizardsList from "./components/WizardsList.vue";
//import AddWizard from "./components/AddWizard.vue";

Vue.use(Router);

export default new Router({
    mode: "history",
    routes: [
        {
            path: "/wizards",
            name: "wizards",
            component: WizardsList,
            children: [
                {
                    path: "/wizard/:id",
                    name: "wizard-details",
                    component: Wizard,
                    props: true
                }
            ]
        }]
  /*      {
            path: "/addWizard",
            name: "addWizard",
            component: AddWizard
        }
    ]*/
});
