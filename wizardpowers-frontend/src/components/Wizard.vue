<template>
    <div>
        <h4>Wizard</h4>
        <div>
            <label>Name: </label> {{wizard.name}}
        </div>
        <div>
            <label>Type: </label> {{wizard.type}}
        </div>
        <div>
            <label>Power Level: </label> {{wizard.powerLevel}}
        </div>
    </div>
</template>

<script>
export default {
    name: 'Wizard',
    props: ['wizard']
}
</script>
