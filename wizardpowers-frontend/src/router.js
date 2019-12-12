import Vue from "vue";
import Router from "vue-router";
import WizardsList from "./components/WizardsList.vue";
import AddWizard from "./components/AddWizard.vue";
import UpdateWizard from "./components/UpdateWizard";
import DeleteWizard from "./components/DeleteWizard";
import Wizard from "./components/Wizard";

Vue.use(Router);

export default new Router({
    mode: "history",
    routes: [
        {
            path: "/",
            redirect: {
                name: "wizards"
            }
        },
        {
            path: "/wizards",
            name: "wizards",
            component: WizardsList
        },
        {
            path: "/wizard/:id",
            name: "wizard",
            component: Wizard,
            props: true
        },
        {
            path: "/wizard-add",
            name: "wizard-add",
            component: AddWizard
        },
        {
            path: "/wizard/:id/edit",
            name: "wizard-edit",
            component: UpdateWizard,
            props: true
        },
        {
            path: "/wizard/:id/delete",
            name: "wizard-delete",
            component: DeleteWizard,
            props: true
        }
    ]
});
