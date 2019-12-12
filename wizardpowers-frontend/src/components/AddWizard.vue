<template id="wizard-add">
    <div class="content-wrapper">
    <h3>Add Wizard</h3>
    <div v-if="!submitted">
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text"
                   class="form-control"
                   id="name"
                   required
                   v-model="wizard.name"
                   name="name" />
        </div>

        <div class="form-group">
            <label for="type">Type</label>
            <input type="text"
                   class="form-control"
                   id="type"
                   required
                   v-model="wizard.type"
                   name="type" />
        </div>

        <div class="form-group">
            <label for="powerLevel">Power Level</label>
            <input type="number"
                   class="form-control"
                   id="powerLevel"
                   required
                   v-model="wizard.powerLevel"
                   name="powerLevel" />
        </div>

        <button @click.stop="addWizard"
                class="btn btn-success">Add Wizard</button>
        <router-link class="btn btn-danger"
                     v-bind:to="{path: '/'}"
                     style="margin-left: 10px">Cancel</router-link>
    </div>
    <div v-else>
        <p class="alert alert-success">You added successfully!</p>
        <button @click.stop="newWizard"
                class="btn btn-info">Add another one</button>
    </div>
    </div>
</template>

<script>
import { ADD_WIZARD_MUTATION } from "../constants/graphql";

export default {
    name: "AddWizard",
    data() {
        return {
            wizard: {
                id: 0,
                name: "",
                type: "",
                powerLevel: 0
            },
            submitted: false
        };
    },
    methods: {
        addWizard() {
            this.$apollo.mutate({
                mutation: ADD_WIZARD_MUTATION,
                variables: {
                    id: this.wizard.id,
                    name: this.wizard.name,
                    type: this.wizard.type,
                    powerLevel: this.wizard.powerLevel
                }
            });
            this.submitted = true;
        },
        newWizard() {
            this.submitted = false;
            this.wizard = {};
        }
    }
};
</script>

<style scoped>

</style>