<template>
  <main id="app">
    <section>
      <div class="jumbotron">
        <div class="container">
          <h1>Fearsome wizard powers!</h1>
          <p>This application is going to help you with managing a list of wizards.</p>
          <p>You can find the list of all registered wizards at
            <router-link class="nav-item" v-bind:to="'wizards'"><a class="nav-link">WIZARDS</a></router-link> or
            you can <router-link class="nav-item" v-bind:to="'wizard-add'"><a class="nav-link">ADD WIZARD</a></router-link>
          </p>
        </div>
      </div>
    </section>
    <section>
      <div class="container">
        <transition name="slide" mode="out-in">
          <router-view />
        </transition>
      </div>
    </section>
  </main>
</template>

<script>
export default {
  name: 'app'
};
</script>

<style>
  body {
    padding: 30px;
  }

  .slide-enter-active {
    animation: slide-in 200ms ease-out forwards;
  }

  .slide-leave-active {
    animation: slide-out 200ms ease-out forwards;
  }

  @keyframes slide-in {
    from {
      transform: translateY(-30px);
      opacity: 0;
    }
    to {
      transform: translateY(0);
      opacity: 1;
    }
  }

  @keyframes slide-out {
    from {
      transform: translateY(0);
      opacity: 1;
    }
    to {
      transform: translateY(-30px);
      opacity: 0;
    }
  }
</style>
