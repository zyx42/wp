<template id="wizard-edit">
       <div class="content-wrapper">
       <h3>Update Wizard</h3>
       <div v-if="!submitted">
           <div class="form-group">
               <input type="hidden"
                      id="id"
                      name="id"
                      v-model="wizard.id" />
               <label for="name">Name:</label>
               <input name="name"
                      id="name"
                      class="form-control"
                      v-model="wizard.name"
                      type="text" />
           </div>
           <div class="form-group">
               <label for="type">Type:</label>
               <input name="type"
                      id="type"
                      class="form-control"
                      v-model="wizard.type"
                      type="text" />
           </div>
           <div class="form-group">
               <label for="powerLevel">Power Level:</label>
               <input name="powerLevel"
                      id="powerLevel"
                      class="form-control"
                      v-model="wizard.powerLevel"
                      type="number" />
           </div>

           <button @click.stop="updateWizard"
                   class="btn btn-success">Update Wizard</button>
           <router-link class="btn btn-danger"
                        v-bind:to="{path: '/'}"
                        style="margin-left: 10px">Cancel</router-link>
       </div>
       <div v-else>
           <p class="alert alert-info">You updated successfully!</p>
       </div>
       </div>
</template>

<script>
import { UPDATE_WIZARD_MUTATION } from "../constants/graphql";

export default {
    name: "UpdateWizard",
    data () {
        return {
            wizard: this.$route.params.wizard,
            submitted: false
        };
    },
    methods: {
        updateWizard() {
            this.$apollo.mutate({
                mutation: UPDATE_WIZARD_MUTATION,
                variables: {
                    id: this.wizard.id,
                    name: this.wizard.name,
                    type: this.wizard.type,
                    powerLevel: this.wizard.powerLevel
                }
            });
            this.submitted = true;
            this.$router.push('/wizards');
        }
    }
};
</script>

<style scoped>
</style>