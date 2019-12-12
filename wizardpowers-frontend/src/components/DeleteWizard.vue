<template id="wizard-delete">
    <section>
        <h2>Delete <b> {{ wizard.name }}</b>?</h2>
        <form v-on:submit.prevent="deleteWizard">
            <p>Are you sure?</p>
            <button type="submit" class="btn btn-main">Delete</button>
            <router-link class="btn" v-bind:to="'/'">Cancel</router-link>
        </form>
    </section>
</template>

<script>
import { DELETE_WIZARD_MUTATION } from "../constants/graphql";

export default {
    name: "DeleteWizard",
    data () {
        return {
            wizard: this.$route.params.wizard
        }
    },
    methods: {
        deleteWizard() {
            this.$apollo.mutate({
                mutation: DELETE_WIZARD_MUTATION,
                variables: {
                    id: this.wizard.id
                }
            });
            this.$router.push('/wizards');
        }
    }
}
</script>

<style scoped>

</style>