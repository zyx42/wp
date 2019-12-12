<template id="wizard">
    <div>
        <h4>{{ wizard.name }}</h4>
        <div>
            <label>Type: </label> {{ wizard.type }}
        </div>
        <div>
            <label>Power Level: </label> {{ wizard.powerLevel }}
        </div>
        <br />
        <router-link v-bind:to="'/'">Back</router-link>
    </div>
</template>

<script>
export default {
    name: 'Wizard',
    data () {
        return {
            wizard: this.$route.params.wizard
        }
    }
}
</script>
