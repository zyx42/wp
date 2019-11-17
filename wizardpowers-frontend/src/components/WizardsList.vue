<template>
    <div>
        <div>
            <h4>Wizards List:</h4>
            <ul>
                <li v-for="wizard in wizards" :key="wizard.id">
                    <wizard :wizard="wizard"/>
   <!--                 <router-link :to="{
                            name: 'wizard-details',
                            params: { wizard: wizard, id: wizard.id }
                            }">
                        {{wizard.name}}
                    </router-link>-->
                </li>
            </ul>
        </div>
        <div>
        </div>
    </div>
</template>


<script>
import Wizard from "./Wizard";
import { ALL_WIZARDS_QUERY } from "../constants/graphql";

export default {
    name: 'WizardsList',
    data () {
        return {
            wizards: []
        }
    },
    components: {
        Wizard
    },
    apollo: {
        getWizards: {
            query: ALL_WIZARDS_QUERY,
            result({data}) {
                this.wizards = data.wizards
            }
        }
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
