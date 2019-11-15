<template>
    <div>
        <div>
            <h4>Wizards List:</h4>
            <ul>
                <wizard v-for="wizard in wizards" :key="wizard.id" :wizard="wizard">
   <!--                 <router-link :to="{
                            name: 'wizard-details',
                            params: { wizard: wizard, id: wizard.id }
                            }">
                        {{wizard.name}}
                    </router-link>-->

                </wizard>
            </ul>
        </div>
        <div>
        </div>
    </div>
</template>


<script>
//import gql from "graphql-tag";
import Wizard from "./Wizard";

export default {
    name: 'WizardsList',
    data () {
        return {
            wizards: [
                {
                    id: '1',
                    type: 'cool',
                    name: 'Merlin',
                    powerLevel: '90'
                }, {
                    id: '2',
                    type: 'lame',
                    name: 'Harry Potter',
                    powerLevel: '1'
                }
            ]
        }
    },
    components: {
        Wizard
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
