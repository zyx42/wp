<template id="wizards">
    <div>
        <div>
            <div class="panel-body">
            <h4>Wizards List:</h4>
            </div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Power Level</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="wizard in wizards" :key="wizard.id">
                        <td>{{wizard.id}}</td>
                        <td>
                            <router-link v-bind:to="{name: 'wizard', params: {wizard: wizard, id: wizard.id}}">
                                {{wizard.name}}</router-link>
                        </td>
                        <td>{{wizard.type}}</td>
                        <td>{{wizard.powerLevel}}</td>
                        <td><router-link class="btn btn-info"
                                    v-bind:to="{name: 'wizard-edit', params: {wizard: wizard, id: wizard.id}}">Update</router-link>
                            <router-link class="btn btn-danger"
                                    v-bind:to="{name: 'wizard-delete', params: {wizard: wizard, id: wizard.id}}"
                                    style="margin-left: 10px">Delete</router-link></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>


<script>
import { ALL_WIZARDS_QUERY } from "../constants/graphql";

export default {
    name: 'WizardsList',
    data() {
        return {
            wizards: []
        }
    },
    apollo: {
        wizards: {
            query: ALL_WIZARDS_QUERY
        }
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
